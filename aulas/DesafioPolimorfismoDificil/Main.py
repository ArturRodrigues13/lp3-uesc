class Node:
	data: int
	prev = 0
	next = 0

	def __init__(self, data):
		self.data = data
		self.next = self
		self.prev = self

	def insert_after(self,data):
		node = ComboNode(data)
		return node

	def delete(self):
		self.prev = self.next
		return self.prev

	def print_list(self):
		node = self
		prim = False
		while(node != self or prim == False):
			print(node.data)
			node = node.next
			prim = True


class InsertNode(Node):
	def insert_after(self,data):
		node = super().insert_after(data)
		node.prev = self
		node.next = self.next
		self.next = node
		return node

class DeleteNode(Node):
	def delete(self):
		node = super().delete()
		node2 = node.next
		node2.prev = node

class PrintNode(Node):
	def print_list(self):
		super().print_list()

class ComboNode(InsertNode,DeleteNode,PrintNode):
	pass


node = ComboNode(1)
new_node = node.insert_after(2)
new_node.insert_after(3)
node.print_list()
