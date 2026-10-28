for_each :#include <algorithm>
#include <vector>
#include <iostream>

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5};

    // Use lambda function to print each number
    std::for_each(numbers.begin(), numbers.end(), [](int num) {
        std::cout << num << " ";
    });

    return 0;
}

