int m;
int i;
int es;
int l;
int n;

main(){
    m = 10;
    i = 1;
    while(i <  m || i == m){ 
        es = m - i;
        while (es > 0){       
            puts(" "); 
            es = es - 1;
        }
        l = 1;
        while (l < (2 * i)){ 
            puts("*");
            l = l + 1;
        }
        puts(" \n"); 
        i = i + 1;
    }
    i = 1;
    while(i < m || i == m){
        es = 1;
        while (es < m - 1 || es == m - 1){       
            puts(" "); 
            es = es + 1;
        }
        puts("*\n"); 
        i = i + 1;
    }
}