import numpy as np
import math
import matplotlib.pyplot as plt

def f1(x,a,b,c): 
    return (x + a) / (b + (1 / np.square(x+c)) )

#The np.float_power function does not power the negative numbers, so we remove the sign(np.abs) and reinsert(np.sign) it later
def f2(x,d,e):
    return ( np.float_power(np.abs(np.sin(x)),d) * np.sign(np.sin(x)) * np.cos(x)) / np.pi * e
    
a,b,c,d,e = 2.7, 3.7, 4.7, 2.8, 3.8
m,g,h = 8,12.001,0.08 # 12.001 = to grab 12

arange = np.arange(m,g,h)
print(arange)

plt.plot(arange, f1(arange,a,b,c))
plt.plot(arange, f2(arange,d,e))
plt.show()
