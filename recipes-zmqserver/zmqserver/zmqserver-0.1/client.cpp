//
// Created by fredrik on 2017-10-31.
// http://zguide.zeromq.org
//
#include <ctime>
#include <iostream>
#include <string>
#include <zmq.hpp>
#include <thread>
#include <chrono>

//client
int main() {
    zmq::context_t context(1);
    zmq::socket_t socket(context, ZMQ_REQ);

    std::cout << "Connecting to a server..." << std::endl;
    socket.connect("tcp://localhost:5555");
    //socket.connect("ipc:///tmp/feed/0");

    for(int request_counter=0; request_counter<10; ++request_counter){
        zmq::message_t request(5);
        memcpy(request.data(), "Hello", 5);
        std::cout << "Sending \"Hello\" " << request_counter << std::endl;
        socket.send(request);

        zmq::message_t replay;
        socket.recv(&replay);
        std::cout << "Received \"World\" " << request_counter << std::endl;
    }

    return 0;
}

