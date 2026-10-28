
find_if: #include <algorithm>
#include <vector>

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    auto it = std::find_if(numbers.begin(), numbers.end(),
        [](int x) { return x > 5; });

    if (it != numbers.end()) {
        std::cout << "First number greater than 5: " << *it << std::endl;
    }

    return 0;
}
