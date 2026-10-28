//Write a Program to search occurrence of character in string.

#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    char ch;
    int count = 0;

    cout << "Enter a string: ";
    getline(cin, str); // Read input string including spaces

    cout << "Enter a character to search for: ";
    cin >> ch; // Read the character to search for

    // Iterate through the string and count occurrences of the character
    for (char c : str) {
        if (c == ch) {
            count++;
        }
    }

    cout << "The character '" << ch << "' occurs " << count << " times in the string." << endl;

    return 0;
}
