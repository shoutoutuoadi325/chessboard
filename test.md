2个print命令结果（各10分）
16个at操作（各5分）

input1：
A,B,C,D,E
B,C,D,E,A
C,D,E,A,B
D,E,A,B,C
E,A,B,C,D
print
at 2 2
at 0 3
at 0 0
at 4 2
at 0 4
exit

output1:
A B C D E
B C D E A
C D E A B
D E A B C
E A B C D 
[(2,2,E), (2,1,D), (2,3,A), (1,2,D), (3,2,A)]
[(0,3,D), (0,2,C), (0,4,E), (1,3,E)]
[(0,0,A), (0,1,B), (1,0,B)]
[(4,2,B), (4,1,A), (4,3,C), (3,2,A)]
[(0,4,E), (0,3,D), (1,4,A)]


input2：
E,A,D,C,B
C,E,B,A,C
A,B,A,E,D
D,B,D,C,D
B,A,C,C,E
print
at 2 2
at 0 3
at 0 0
at 4 2
at 0 4
exit

output2:
E A D C B
C E B A C
A B A E D
D B D C D
B A C C E
[(2,2,A), (2,1,B), (2,3,D), (1,2,B), (3,2,E)]
[(0,3,D), (0,2,A), (0,4,B), (1,3,B)]
[(0,0,E), (0,1,C), (1,0,A)]
[(4,2,D), (4,1,C), (4,3,D), (3,2,E)]
[(0,4,B), (0,3,D), (1,4,A)]

input3：
C,E,B,A,C
B,A,C,C,E
A,B,A,E,D
D,B,D,C,D
E,A,D,C,B
at 2 2
at 0 3
at 0 0
at 4 2
at 0 4
at 2 0
exit

output3:
[(2,2,A),(2,1,C),(2,3,D),(1,2,B),(3,2,E)]
[(0,3,D),(0,2,A),(0,4,E),(1,3,B)]
[(0,0,C),(0,1,B),(1,0,E)]
[(4,2,D),(4,1,E),(4,3,D),(3,2,E)]
[(0,4,E),(0,3,D),(1,4,A)]
[(2,0,B),(2,1,C),(1,0,E),(3,0,A)]
