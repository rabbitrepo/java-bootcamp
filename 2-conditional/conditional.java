char find(double score) {
    if (score >= 80.0)
        return 'A';
    if (score >= 70.0)
        return 'B';
    if (score >= 60.0)
        return 'C';
    if (score >= 50.0)
        return 'D';
    return 'F'; // Fallback Condition
}

void main() {
    char a = find(75);
    System.out.print(a);
}