import numpy as np 

"""
    one   = (1)*T1    + (-1/3)*T2 + (-1/3)*T3 + (0*T4)
    two   = (-1/2)*T1 + (1)*T2    + (0)*T3    + (-1/2*T4)
    three = (-1/2)*T1 + (0)*T2    + (1)*T3    + (-1/2*T4)
    four  = (0)*T1    + (-1/3)*T2 + (-1/3)*T3 + (1*T4)
"""

T1,T2,T3,T4 = 0,0,0,0
Ta, Tb = 2.7, 3.7

# We create an array of T1, T2, T3, T4 coefficients in each equivalence.
A = np.array(
        [
            [1, -1/3, -1/3, 0], 
            [1/2, 1, 0, -1/2], 
            [-1/2, 0, 1, -1/2],
            [0,-1/3,-1/3,-1]
        ]
    ) 

B = np.array([Ta/3, 0, 0, Tb/3]) 

T1,T2,T3,T4 = np.linalg.solve(A, B)

print ("T1 : "+str(T1)+"\nT2 : "+str(T2)+"\nT3 : "+str(T3)+"\nT4 : "+str(T4))
if(np.allclose(np.dot(A, [T1,T2,T3,T4]), B)):
    print("Values(T1,T2,T3,T4) are correct")
else:
    print("Values(T1,T2,T3,T4) are wrong")
