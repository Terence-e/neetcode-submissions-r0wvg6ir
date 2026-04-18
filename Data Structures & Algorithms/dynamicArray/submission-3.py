class DynamicArray:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.arr = [0] * capacity
        self.s = 0

    def get(self, i: int) -> int:
        return self.arr[i]

    def set(self, i: int, n: int) -> None:
        self.arr[i] = n

    def pushback(self, n: int) -> None:
        if self.s < self.capacity:
            self.arr[self.s] = n
            self.s += 1
        else:
            self.resize()
            self.arr[self.s] = n
            self.s += 1

    def popback(self) -> int:
        if self.s == 0:
            raise Exception("OOOOUUUTTT!!")
        self.s -= 1
        return self.arr[self.s]

    def resize(self) -> None:
        a = [0] * (self.capacity * 2)
        for i in range(self.capacity):
            a[i] = self.arr[i]
        self.arr = a
        self.capacity = self.capacity * 2

    def getSize(self) -> int:
        return self.s

    def getCapacity(self) -> int:
        return self.capacity