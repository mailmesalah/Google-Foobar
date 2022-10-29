from itertools import combinations

def answer(num_buns, num_required):
    buns = [[] for i in range(num_buns)]
    print (buns)
    if num_required == 0:
        return buns
    start = 0    
    for c in combinations(buns, num_buns - num_required + 1):
        #print (c)
        for item in c:
            #print (item)
            item.append(start)
            #print (item)
        start += 1
        print (c)
        print ("---")
    return buns
