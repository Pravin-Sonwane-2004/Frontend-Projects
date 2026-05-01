class CountDigitsOfNumber {
    void main() {
        IO.print(count(100, 0));
    }

    int count(int num,int cc) {
        if(num == 0) return cc;
        cc++;
        return count(num/10, cc);
    }
}