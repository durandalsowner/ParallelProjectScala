#!/usr/bin/env python
# coding: utf-8

# In[2]:


import matplotlib.pyplot as plt


# In[ ]:





# In[8]:


parallelismArray = [1000000,2000000,3000000,4000000,5000000,6000000,7000000,8000000,9000000,10000000]
p2 = [0.0330472, 0.023604, 0.0322572, 0.6452478, 0.4882136, 0.7931152, 0.3586495, 0.4661554, 0.1578058, 0.1594193]
p4 = [0.0227929, 0.0197985, 0.0394743, 0.0442298, 0.7813238, 0.1391997, 0.6591198, 0.7920041, 0.2084079, 0.1637147]
p6 = [0.0112593, 0.0204792, 0.07207, 0.0457049, 0.0549559, 0.1762455, 0.0678706, 0.8395065, 0.1634589, 0.1620384]
p8 = [0.016131, 0.0217788, 0.0749961, 0.0450671, 0.0456917, 0.1653446, 0.0733979, 0.8630614, 0.1907495, 0.1599536]
p10 = [0.0133672, 0.0721122, 0.0700186, 0.0433762, 0.0570212, 0.1703894, 0.1482349, 0.1600069, 0.3237295, 0.2944078]
p12 = [0.0129373, 0.0532861, 0.0290475, 0.4043035, 0.2023033, 0.519802, 0.1402561, 0.2174307, 0.1869979, 0.6307925]
plt.plot(parallelismArray, p2, label='parallelism 2')
plt.plot(parallelismArray, p4, label='parallelism 4')
plt.plot(parallelismArray, p6, label='parallelism 6')
plt.plot(parallelismArray, p8, label='parallelism 8')
plt.plot(parallelismArray, p10, label='parallelism 10')
plt.plot(parallelismArray, p12, label='parallelism 12')
plt.ylabel('execution time(s)')
plt.xlabel('size of parallel list')
plt.title('Parallel Map with different parallelism thread pool sizes')
plt.legend()
plt.show()


# In[3]:


parallelismArray = [1000000,2000000,3000000,4000000,5000000,6000000,7000000,8000000,9000000,10000000]
p1 = [0.3034423, 0.432553001, 0.6577598, 1.069573799, 1.774644101, 2.0735082, 1.279556301, 2.1753412, 2.0982669, 2.4227156]
p2 = [0.078939999, 0.1742702, 0.076344201, 0.333283501, 0.1784597, 0.449713301, 0.2040268, 0.24454, 0.1642663, 0.649841201]

plt.plot(parallelismArray, p1, label='sequential')
plt.plot(parallelismArray, p2, label='parallel')

plt.ylabel('execution time(s)')
plt.xlabel('size of list')
plt.title('Sequential and Parallel map for long list')
plt.legend()
plt.show()


# In[5]:


parallelismArray2 = [1000,2000,3000,4000,5000,6000,7000,8000,9000,10000]
p3 = [5.155E-4, 3.356E-4, 3.059E-4, 3.518E-4, 4.165E-4, 5.03401E-4, 5.76501E-4, 6.572E-4, 7.38799E-4, 8.238E-4]
p4 = [0.001323099, 9.479E-4, 0.0011341, 9.271E-4, 0.001109901, 9.68E-4, 0.0011557, 0.001073899, 0.0012707, 0.0012054]
plt.plot(parallelismArray2, p3, label='sequential')
plt.plot(parallelismArray2, p4, label='parallel')
plt.ylabel('execution time(s)')
plt.xlabel('size of list')
plt.title('Sequential and Parallel map for short list')
plt.legend()
plt.show()


# In[ ]:




