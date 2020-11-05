cmake_minimum_required(VERSION 3.17)
project(ressource_TDExpression_2020)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(ressource_TDExpression_2020
        Binary_Div.cpp
        Binary_Div.h
        Binary_Expr.cpp
        Binary_Expr.h
        Binary_Mult.cpp
        Binary_Mult.h
        Binary_Plus.cpp
        Binary_Plus.h
        Constant.cpp
        Constant.h
        Expr.cpp
        Expr.h
        main_Expr.cpp
        Unary_Expr.cpp
        Unary_Expr.h
        Unary_Minus.cpp
        Unary_Minus.h
        Unary_Plus.cpp
        Unary_Plus.h)
