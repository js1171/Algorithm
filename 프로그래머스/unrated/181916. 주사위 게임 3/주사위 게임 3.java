class Solution {
    public int solution(int a, int b, int c, int d) {
        
        if (a==b && b==c && c==d && d==a) {
            return 1111*a;
        }
        else if (a==b && a==c && a!=d) {
            return (10*a+d)*(10*a+d);
        }
        else if (a==b && a==d && a!=c) {
            return (10*a+c)*(10*a+c);
        }
        else if (a==c && a==d && a!=b) {
            return (10*a+b)*(10*a+b);
        }
        else if (b==c && b==d && b!=a) {
            return (10*b+a)*(10*b+a);
        }
        else if (a==b && a!=c && c!=d) {
            return c*d;
        }
        else if (a==c && a!=b && b!=d) {
            return b*d;
        }
        else if (a==d && a!=b && b!=c) {
            return b*c;
        }
        else if (b==c && b!=a && a!=d) {
            return a*d;
        }
        else if (b==d && b!=a && a!=c) {
            return a*c;
        }
        else if (c==d && c!=a && a!=b) {
            return a*b;
        }
        else if (a==b && c==d) {
            return (a+c) * Math.abs(a-c);
        }
        else if (a==c && b==d) {
            return (a+b) * Math.abs(a-b);
        }
        else if (a==d && b==c) {
            return (a+b) * Math.abs(a-b);
        }
        else {
            return Math.min(Math.min(a,b),Math.min(c,d));
        }
    }
}