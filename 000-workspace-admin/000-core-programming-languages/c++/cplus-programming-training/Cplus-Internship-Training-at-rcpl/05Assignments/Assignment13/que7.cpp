#include <iostream>
#include <cstdio> // for scanf

using namespace std;

int main() {
    char str[100];
    int vowelCount = 0;
    int consonantCount = 0;

    cout << "Enter a string (up to 99 characters): ";
    // Read the input string safely
    scanf("%99[^\n]", str); // Reads up to 99 characters or until newline

    // Process the string
    for (int i = 0; str[i] != '\0'; i++) {
        char ch = tolower(str[i]); // Convert character to lowercase for easy comparison
        if (ch >= 'a' && ch <= 'z') { // Check if the character is an alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
    }

    cout << "\nVowel count: " << vowelCount << " Consonant count: " << consonantCount << endl;

    return 0;
}
