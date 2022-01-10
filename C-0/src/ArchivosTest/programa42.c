int m;
int i;
int es;
int l;
int n;

main(){
    m = 20;
    i = 1;
    while(i <  m || i == m){ 
        es = m - i;
        while (es > 0){       
            puts(" "); 
            es = es - 1;
        }
        l = 1;
        while (l < 2 * i){ 
            puts("*");
            l = l + 1;
        }
        puts("\n"); 
        i = i + 1;
    }
    i = m - 1;
    while(i > 1 || i == l){
        es = m - i;
        while (es > 0){       
            puts(" "); 
            es = es - 1;
        }
        l = 1;
        while (l < 2 * i){ 
            puts("*");
            l = l + 1;
        }
        puts(" \n"); 
        i = i - 1;
    }
}