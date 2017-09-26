//
// Created by chan on 2017/9/4.
//

#ifdef  DEBUG
#include <iostream>
#endif

#ifdef LOG_D
#undef LOG_D
#endif

#ifdef DEBUG
#define LOG_D(tag, message) std::cout << (tag) << " " << (message) << std::endl;
#else
#define LOG_D
#endif