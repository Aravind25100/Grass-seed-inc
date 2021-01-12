C=gets.to_f;
if(C>0 and C<=100)
    L=gets.to_i;
    if(L>0 and L<=100)
        sum=0;
        for i in 1..L
           l,w=gets.chomp.split.map(&:to_f);
           sum+=l*w;
        end
        puts(sum*C)
   end
end