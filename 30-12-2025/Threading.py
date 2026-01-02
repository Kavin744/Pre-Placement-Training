import threading, queue

q = queue.Queue()

def producer():
    for i in range(5):
        q.put(i)

def consumer():
    while not q.empty():
        print(q.get())

threading.Thread(target=producer).start()
threading.Thread(target=consumer).start()
