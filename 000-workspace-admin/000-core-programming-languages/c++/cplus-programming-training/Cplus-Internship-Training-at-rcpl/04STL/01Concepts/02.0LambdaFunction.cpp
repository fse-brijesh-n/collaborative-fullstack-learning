#include <iostream>
using namespace std;

// Function to show the value of a
void show(int a) {
    cout << a;
}

int main() {
    int a;
    cin >> a;

    // Call the show function
    show(a);

    // Lambda function to show the value of a
    auto lambdaShow = [a]() {
        cout << a;
    };
    lambdaShow();

    // Alternatively, you can use auto to deduce the type and call it immediately
    auto call = [a]() { cout << a; };
    call();

    // Or even more concisely
    [a]() { cout << a; }(); // Notice the () at the end to call the lambda

    return 0;
}