

add_library(one SHARED one.cpp)

target_link_libraries(one ${log-lib} )