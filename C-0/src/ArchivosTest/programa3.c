int x;
int y;
main() {
x=10;
y=0;
puts("Se debe escribir 10 : ");
putw(x);
puts("\n");
while(x>0) {
y=y+x;
x=x-1;
}
puts("Se debe escribir 55 : ");
putw(y);
puts("\n");
if(x==0) {
puts("Esto se debe leer\n");
} else {
puts("Esto no se debe leer\n");
}
puts("Se debe escribir 11 : ");
putw(x+(y/5));
puts("\n");
}