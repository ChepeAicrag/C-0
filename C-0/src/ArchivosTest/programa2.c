int x;
int y;
main() {
x=1-12;
y=x*32;
x=(32/12)*y;
if(x>7) {
while(y>0) {
y=y-1;
if(y>1) {
break;
}
}
}
puts(“Cadena\n”);
puts(“de texto”);
putw(x+y);
}