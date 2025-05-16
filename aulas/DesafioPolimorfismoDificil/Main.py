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
		node.prev = self
		node.next = self.next
		self.next.prev = node
		self.next = node
		return node

	def delete(self):
		self.prev.next = self.next
		self.next.prev = self.prev
		return self.prev

	def print_list(self):
		node = self
		while True:
			print(node.data)
			node = node.next
			if(node == self):
				print(node.data)
				break


class InsertNode(Node):
	def insert_after(self,data):
		node = super().insert_after(data)
		return node

class DeleteNode(Node):
	def delete(self):
		node = super().delete()
		if(node == self):
			node.prev = node
			node.next = node
		return node

class PrintNode(Node):
	def print_list(self):
		super().print_list()

class ComboNode(InsertNode,DeleteNode,PrintNode):
	pass


node = ComboNode(1)
new_node = node.insert_after(2)
new_node.insert_after(3)
new_new_node = node.insert_after(10)
new_new_node.prev.delete()
new_new_node.print_list()
