#include <stdio.h>

double f(double x) {
    return 4.184 * x;
}

void main() {
    double a = f(3);
    printf("Total: %.3f", a);
}