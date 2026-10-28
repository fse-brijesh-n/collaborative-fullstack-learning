//Write a Program to find maximum occurrence of a character. 
#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str); // Read the entire line of input

    // Create a map to store character frequencies
    unordered_map<char, int> freq;

    // Count occurrences of each character
    for (char ch : str) {
        if (ch != ' ') { // Optional: ignore spaces if desired
            freq[ch]++;
        }
    }

    // Find the character with the maximum frequency
    char maxChar = '\0';
    int maxCount = 0;
    for (const auto& pair : freq) {
        if (pair.second > maxCount) {
            maxCount = pair.second;
            maxChar = pair.first;
        }
    }

    // Output the result
    if (maxCount > 0) {
        cout << "The character with the maximum occurrence is '" << maxChar 
             << "' with " << maxCount << " occurrences." << endl;
    } else {
        cout << "No characters found in the string." << endl;
    }

    return 0;
}
