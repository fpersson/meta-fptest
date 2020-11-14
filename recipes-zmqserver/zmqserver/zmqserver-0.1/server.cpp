#include <ctime>
#include <iostream>
#include <string>
#include <zmq.hpp>
#include <thread>
#include <chrono>

//server
int main() {
    std::cout << "A Basic server." << std::endl;
    zmq::context_t context(1);
    zmq::socket_t socket(context, ZMQ_REP);
    socket.bind("tcp://*:5555");
    //socket.bind("ipc:///tmp/feed/0");

    while(true) {
        zmq::message_t request;
        socket.recv(&request);
        std::cout << "Received a message" << std::endl;
        //std::this_thread::sleep_for(std::chrono::seconds(1)); //work simulator

        zmq::message_t replay(5); //5= message size
        memcpy(replay.data(), "World", 5);
        socket.send(replay);
    }
    return 0;
}
