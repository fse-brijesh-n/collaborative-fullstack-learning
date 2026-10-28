#include <algorithm>
#include <vector>

int main() {
    std::vector<std::string> names = {"John", "Alice", "Bob", "Charlie", "David"};

    std::sort(names.begin(), names.end(),
        [](const std::string& a, const std::string& b) {
            return a.length() < b.length();
        });

    for (const auto& name : names) {
        std::cout << name << std::endl;
    }

    return 0;
}
