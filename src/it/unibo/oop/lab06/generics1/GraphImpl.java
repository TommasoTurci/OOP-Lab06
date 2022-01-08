package it.unibo.oop.lab06.generics1;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GraphImpl<N> implements Graph<N> {
	Set<N> nset = new TreeSet<>();
	Map<N, Set<N>> emap = new HashMap<>();
	Map<N, N> holder = new HashMap<>();
	N app;

	@Override
	public void addNode(N node) {
		nset.add(node);
	}

	@Override
	public void addEdge(N source, N target) {
		emap.get(source).add(target);
	}

	@Override
	public Set<N> nodeSet() {
		return nset;
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return emap.get(node);
	}

	@Override
	public List<N> getPath(N source, N target) {
		holder.put(source, null);
		N temp=source;
		for(N node : linkedNodes(temp)) {
			
			if(node!=target) {
				holder.put(temp, node);
				app=source;
				getPath(node, target);
			}
			else; //TROVATO L'ARRIVO!
			
		}
		return null;
	}

}
