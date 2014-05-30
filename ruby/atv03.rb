require 'graphlab.rb'
include GraphLab

#t1
g = Graph.new

#t2
v1 = Vertex.new(1)
g.addVertex(v1)

#t3
v2 = Vertex.new(2, 100, 500)
g.addVertex(v2)

#t4
v3 = Vertex.new(3)
g.addVertex(v3)
v4 = Vertex.new(4)
g.addVertex(v4)
v5 = Vertex.new(5)
g.addVertex(v5)
v6 = Vertex.new(6)
g.addVertex(v6)
v7 = Vertex.new(7)
g.addVertex(v7)
v8 = Vertex.new(8)
g.addVertex(v8)

#t5
g.deleteVertex(v8)
#t6
g.vertices
#t7
g.addEdge(v1, v4)

#t8
g.addEdge(v1, v7)
g.addEdge(v7, v4)
g.addEdge(v4, v5)
g.addEdge(v4, v2)
g.addEdge(v5, v2)
g.addEdge(v5, v6)
g.addEdge(v2, v6)
g.addEdge(v6, v3)
g.addEdge(v6, v7)
g.addEdge(v3, v7)
g.addEdge(v3, v1)

#t9
g.deleteEdge(v3, v1)

#t10
v1.adjList

#t11
v2.adjList
v3.adjList
v4.adjList
v5.adjList
v6.adjList
v7.adjList

#t12


#t13
g.dfs(v1)

#t14
g.dfs(v2)
g.dfs(v3)
g.dfs(v4)
g.dfs(v5)
g.dfs(v6)
g.dfs(v7)
#t15
g.bfs(v1)
#t16
g.bfs(v2)
g.bfs(v3)
g.bfs(v4)
g.bfs(v5)
g.bfs(v6)
g.bfs(v7)
#t17
traversal(g, v1, :dfs)
traversal(g, v1, :bfs)


#t18
va = Vertex.new("A")
vb = Vertex.new("B")
vc = Vertex.new("C")
vd = Vertex.new("D")
ve = Vertex.new("E")
vf = Vertex.new("F")

#t19
g2 = Graph.new
g2.addVertex(va)
g2.addVertex(vb)
g2.addVertex(vc)
g2.addVertex(vd)
g2.addVertex(ve)
g2.addVertex(vf)

#t20
g2.addEdge(va, vb)
g2.addEdge(va, vc)
g2.addEdge(vb, vc)
g2.addEdge(vb, vd)
g2.addEdge(vb, ve)
g2.addEdge(vc, vd)
g2.addEdge(vd, vf)
g2.addEdge(ve, vd)

#t21
topsort(g2)

#t22
vh = Vertex.new("H")
g2.addVertex(vh)
g2.addEdge(vh, va)

#t23
topsort(g2)

#t24
vj = Vertex.new("J")
g2.addVertex(vj)
g2.addEdge(vf, vj)

#t25
topsort(g2)


#Exercicies 01

require 'graphlab'
include GraphLab
va = Vertex.new("Singapore")
vb = Vertex.new("Jakarta")
vc = Vertex.new("Kuala Lumpur")
vd = Vertex.new("BangKok")
ve = Vertex.new("Manila")
vf = Vertex.new("Bandar Seri Begawan")
vg = Vertex.new("Hanoi")
vh = Vertex.new("Phnom Penh")
vi = Vertex.new("Vientiane")
vj = Vertex.new("Naypyidaw")

g2 = Graph.new
g2.addVertex(va)
g2.addVertex(vb)
g2.addVertex(vc)
g2.addVertex(vd)
g2.addVertex(ve)
g2.addVertex(vf)
g2.addVertex(vg)
g2.addVertex(vh)
g2.addVertex(vi)
g2.addVertex(vj)

g2.addEdge(va, vb)
g2.addEdge(va, vc)
g2.addEdge(vb, vc)
g2.addEdge(vb, vd)
g2.addEdge(vb, ve)
g2.addEdge(vc, vd)
g2.addEdge(vd, vf)
g2.addEdge(ve, vd)
g2.addEdge(vf, vg)
g2.addEdge(vg, vh)
g2.addEdge(vh, vi)
g2.addEdge(vi, vj)
gets

topsort(g2)

#Exercicies 02

R: A solução para este problema seria
a sobreposição entre os dois grafos e o
indivíduo poderá verificar visualmente
quais seriam as melhores ligações, isso
em casos de poucas ligações.

#Exercicies 04

include GraphLab
 
va = Vertex.new("A")
vb = Vertex.new("B")
vc = Vertex.new("C")
vd = Vertex.new("D")
ve = Vertex.new("E")
vf = Vertex.new("F")
vg = Vertex.new("G")
vh = Vertex.new("H")
vi = Vertex.new("I")
vj = Vertex.new("J")
g2 = Graph.new
g2.addVertex(va)
g2.addVertex(vb)
g2.addVertex(vc)
g2.addVertex(vd)
g2.addVertex(ve)
g2.addVertex(vf)
g2.addVertex(vg)
g2.addVertex(vh)
g2.addVertex(vi)
g2.addVertex(vj)
g2.addEdge(va, vb) 
g2.addEdge(va, vi)
g2.addEdge(vb, vd)
g2.addEdge(vb, vh)
g2.addEdge(vc, vd)
g2.addEdge(vd, vh)
g2.addEdge(ve, vf)
g2.addEdge(ve, vg)
g2.addEdge(vf, va)
g2.addEdge(vg, vj)
g2.addEdge(vh, ve)
g2.addEdge(vi, vb)
g2.addEdge(vi, vj)
g2.addEdge(vj, va)

#a)
va.adjList
[B, I]

#b)
A -> J F
B -> I A
C -> D 
D -> B C
E -> H
F -> E
G -> E
H -> D B
I -> A
J -> A


#c)

A -> I B
B -> D
D -> H 
E -> F G
F -> A
G -> J
H -> E
I -> B J
J -> G I

#d)

#e)

#f)
g2.bfs(va)

#g)
g2.dfs(va)



#Exercicies 05
va = Vertex.new("A")
vb = Vertex.new("B")
vc = Vertex.new("C")
vd = Vertex.new("D")
ve = Vertex.new("E")
vf = Vertex.new("F")
vg = Vertex.new("G")
vh = Vertex.new("H")
vi = Vertex.new("I")
vj = Vertex.new("J")
vl = Vertex.new("L")
vk = Vertex.new("K")
vm = Vertex.new("M")
vn = Vertex.new("N")
vo = Vertex.new("O")
vp = Vertex.new("P")

g2 = Graph.new
g2.addVertex(va)
g2.addVertex(vb)
g2.addVertex(vc)
g2.addVertex(vd)
g2.addVertex(ve)
g2.addVertex(vf)
g2.addVertex(vg)
g2.addVertex(vh)
g2.addVertex(vi)
g2.addVertex(vj)
g2.addVertex(vl)
g2.addVertex(vk)
g2.addVertex(vm)
g2.addVertex(vn)
g2.addVertex(vo)
g2.addVertex(vp)

g2.addEdge(va, vb)
g2.addEdge(va, vc)
g2.addEdge(vb, vd)
g2.addEdge(vb, vh)
g2.addEdge(vc, vf)
g2.addEdge(vd, vf)
g2.addEdge(vd, vc)
g2.addEdge(ve, vg)
g2.addEdge(vg, vi)
g2.addEdge(vg, vm)
g2.addEdge(vg, vj)
g2.addEdge(vh, ve)
g2.addEdge(vm, vl)
g2.addEdge(vk, vh)
g2.addEdge(vk, vl)
g2.addEdge(vl, vi)
g2.addEdge(vl, vh)
g2.addEdge(vn, vm)
g2.addEdge(vo, vp)
g2.addEdge(vp, vo)

#5)
#a
va.adjList
[B, C]

#c)

A -> B, C
B -> D, H
C -> F
D -> F, C
E -> G
G -> I, M, J
H -> E
M -> L
K -> H, L
N -> M
O -> P
P -> O
