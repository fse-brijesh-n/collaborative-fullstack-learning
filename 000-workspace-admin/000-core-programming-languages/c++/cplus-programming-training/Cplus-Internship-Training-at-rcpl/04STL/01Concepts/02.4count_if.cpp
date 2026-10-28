#include <algorithm>
#include <vector>

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int count = std::count_if(numbers.begin(), numbers.end(),
        [](int x) { return x % 2 == 0; });

    std::cout << "Number of even numbers: " << count << std::endl;

    return 0;
}
