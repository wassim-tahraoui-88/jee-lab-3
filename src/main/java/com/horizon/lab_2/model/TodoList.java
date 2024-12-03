package com.horizon.lab_2.model;

import java.util.ArrayList;

public class TodoList {

	private final ArrayList<Task> tasks;

	public TodoList() {
		this.tasks = new ArrayList<>();
	}

	public void add(Task task) {
		tasks.add(task);

	}

	public ArrayList<Task> getAll() { return tasks; }

	public void remove(String name) {
		for (Task task : tasks) {
			if (task.getName().equals(name)) {
				tasks.remove(task);
				return;
			}
		}
	}
}
