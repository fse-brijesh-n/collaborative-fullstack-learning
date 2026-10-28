#include <algorithm>
#include <vector>

int main() {
    std::vector<int> numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

    auto it = std::unique(numbers.begin(), numbers.end(),
        [](int a, int b) { return a == b; });

    numbers.erase(it, numbers.end());

    for (const auto& num : numbers) {
        std::cout << num << std::endl;
    }

    return 0;
}
