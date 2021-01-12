C=float(input())
if(C>0 and C<=100):
    L=int(input())
    if(L>0 and L<=100):
        sum=0
        for i in range(0,L):
            lst=input().split();
            l=float(lst[0])
            w=float(lst[1])
            sum+=l*w
        print(sum*C)