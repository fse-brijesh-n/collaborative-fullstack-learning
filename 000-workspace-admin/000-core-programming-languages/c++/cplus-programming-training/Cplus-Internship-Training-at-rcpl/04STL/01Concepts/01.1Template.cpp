#include <iostream>
using namespace std;

template <typename T>
class Array {
private:
    T* ptr;
    int size;
public:
    Array(T arr[], int size);
    ~Array(); // Destructor to deallocate memory
    void print() ; // Print method should be const since it does not modify the object
};

template <typename T>
Array<T>::Array(T arr[], int size) : size(size) { // Initialization list used for size
    ptr = new T[size]; // Allocate memory
    for (int i = 0; i < size; i++) {
        ptr[i] = arr[i];
    }
}

template <typename T>
Array<T>::~Array() { // Destructor to deallocate memory
    delete[] ptr;
}

template <typename T>
void Array<T>::print()  {
    for (int i = 0; i < size; i++) {
        cout << " " << ptr[i];
    }
    cout << endl; // Add a newline at the end
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int size = sizeof(arr) / sizeof(arr[0]); // Determine size of the array
    Array<int> Obj1(arr, size);
    Obj1.print(); // Call print method to display the array
    return 0;
}
