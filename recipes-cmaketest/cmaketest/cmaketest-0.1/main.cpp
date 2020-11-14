#include <iostream>
#include <chrono>
#include <thread>

int main(int argc, char **argv)
{
    std::cout << "[ START ] This works" << std::endl;
    std::this_thread::sleep_for(std::chrono::seconds(1));
    std::cout << "[ STOP ] This works" << std::endl;
    return 0;
}
