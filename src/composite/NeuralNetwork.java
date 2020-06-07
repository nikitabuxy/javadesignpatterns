package composite;

import java.util.*;
import java.util.function.Consumer;

interface SomeNeurons extends Iterable<Neuron> {
    default void connectTo(SomeNeurons otherNeurons) {
        if(this == otherNeurons) return;
        for (Neuron from : this) {
            for (Neuron to : otherNeurons) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}

class Neuron implements SomeNeurons {
    public ArrayList<Neuron> in, out;

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this);
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();
    }
}

class NeuronLayer extends ArrayList<Neuron> implements SomeNeurons{

}
public class NeuralNetwork {
    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        Neuron neuron1 = new Neuron();
        NeuronLayer neuronLayer = new NeuronLayer();
        NeuronLayer neuronLayer1 = new NeuronLayer();

        neuron.connectTo(neuron1);
        neuron.connectTo(neuronLayer);
        neuronLayer.connectTo(neuron);
        neuronLayer1.connectTo(neuron1);
    }
}
