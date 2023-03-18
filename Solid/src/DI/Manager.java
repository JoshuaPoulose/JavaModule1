package DI;

class manager{
	Worker worker;
	public void setWorker(Worker w) {
		worker=w;
	}
	public void manager() {
		worker.work();
	}
}
