#include <iostream>
#include <cstdio> // for scanf

using namespace std;

int main() {
    char str[100];
    int dCount = 0;
    int aCount = 0;
    int sepCount = 0;

    cout << "Enter a string (up to 99 characters): ";
    // Read the input string safely
    scanf("%99[^\n]", str); // Reads up to 99 characters or until newline

    // Process the string
    for (int i = 0; str[i] != '\0'; i++) {
        if ((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')) {
            aCount++;
        } else if (str[i] >= '0' && str[i] <= '9') {
            dCount++;
        } else {
            sepCount++;
        }
    }

    cout << "\nDigit count: " << dCount << " Alphabet count: " << aCount << " Special character count: " << sepCount << endl;

    return 0;
}
