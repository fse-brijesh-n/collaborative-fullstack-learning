#include <iostream>
using namespace std;

int main() {
    int m, n;
    cout << "Enter the number of rows: ";
    cin >> m;
    cout << "Enter the number of columns: ";
    cin >> n;

    // Dynamically allocate memory for 2D arrays using pointers to pointers
    int** arr1 = new int*[m];
    int** arr2 = new int*[m];
    int** result = new int*[m];

    for (int i = 0; i < m; ++i) {
        arr1[i] = new int[n];
        arr2[i] = new int[n];
        result[i] = new int[n];
    }

    cout << "Enter elements for array1:\n";
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            cin >> arr1[i][j];
        }
    }

    cout << "Enter elements for array2:\n";
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            cin >> arr2[i][j];
        }
    }

    // Compute the sum of the two matrices
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            result[i][j] = arr1[i][j] - arr2[i][j];
        }
    }

    // Print array1
    cout << "Entered array1 elements:\n";
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            cout << arr1[i][j] << " ";
        }
        cout << endl;
    }

    // Print array2
    cout << "Entered array2 elements:\n";
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            cout << arr2[i][j] << " ";
        }
        cout << endl;
    }

    // Print result
    cout << "Diff of array1 and array2:\n";
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            cout << result[i][j] << " ";
        }
        cout << endl;
    }

    // Free dynamically allocated memory
    for (int i = 0; i < m; ++i) {
        delete[] arr1[i];
        delete[] arr2[i];
        delete[] result[i];
    }
    delete[] arr1;
    delete[] arr2;
    delete[] result;

    return 0;
}
