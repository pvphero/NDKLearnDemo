

add_library(two SHARED two.cpp)

target_link_libraries(two ${log-lib} )