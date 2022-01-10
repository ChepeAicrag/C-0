int x;
int a;
int b;
main() {
    a = 10;
    x = a;
    while((a < x || a == x) && a > 0){
        b = x;
        while(b != 0){
            puts(" * ");
            b = b - 1;
        }
        puts("\n"); 
        a = a - 1;
    }
}