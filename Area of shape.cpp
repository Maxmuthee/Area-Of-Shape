#include <iostream>
#include <cmath>
using namespace std;

void calculateCircleArea() {
    double radius;
    cout << "Enter the radius of the circle: ";
    cin >> radius;
    double area = M_PI * radius * radius;
    cout << "The area of the circle is: " << area << endl;
}

void calculateRectangleArea() {
    double length, width;
    cout << "Enter the length and width of the rectangle: ";
    cin >> length >> width;
    double area = length * width;
    cout << "The area of the rectangle is: " << area << endl;
}

void calculateTriangleArea() {
    double base, height;
    cout << "Enter the base and height of the triangle: ";
    cin >> base >> height;
    double area = 0.5 * base * height;
    cout << "The area of the triangle is: " << area << endl;
}

int main() {
    int choice;
    cout << "Which shape do you want to calculate area for:\n";
    cout << "1. Circle\n";
    cout << "2. Rectangle\n";
    cout << "3. Triangle\n";
    cout << "Enter your choice: ";
    cin >> choice;

    switch (choice) {
        case 1:
            calculateCircleArea();
            break;
        case 2:
            calculateRectangleArea();
            break;
        case 3:
            calculateTriangleArea();
            break;
        default:
            cout << "Invalid choice!" << endl;
            break;
    }

    return 0;
}