package ru.leti;

import ru.leti.wise.task.graph.util.FileLoader;
import org.junit.jupiter.api.Test;


import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class IsIndependentSetOfEdgesDisconnectingTest {
    @Test
    public void GraphTest1() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph1 = FileLoader.loadGraphFromJson("src/test/resources/1.json");
        assertThat(isIndependentSetofEdges.run(graph1)).isTrue();
    }

    @Test
    public void GraphTest2() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph2 = FileLoader.loadGraphFromJson("src/test/resources/2.json");
        assertThat(isIndependentSetofEdges.run(graph2)).isTrue();
    }

    @Test
    public void GraphTest3() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph3 = FileLoader.loadGraphFromJson("src/test/resources/3.json");
        assertThat(isIndependentSetofEdges.run(graph3)).isFalse();
    }

    @Test
    public void GraphTest4() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph4 = FileLoader.loadGraphFromJson("src/test/resources/4.json");
        assertThat(isIndependentSetofEdges.run(graph4)).isTrue();
    }

    @Test
    public void GraphTest5() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph5 = FileLoader.loadGraphFromJson("src/test/resources/5.json");
        assertThat(isIndependentSetofEdges.run(graph5)).isTrue();
    }

    @Test
    public void GraphTest6() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph6 = FileLoader.loadGraphFromJson("src/test/resources/6.json");
        assertThat(isIndependentSetofEdges.run(graph6)).isTrue();
    }

    @Test
    public void GraphTest7() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph7 = FileLoader.loadGraphFromJson("src/test/resources/7.json");
        assertThat(isIndependentSetofEdges.run(graph7)).isTrue();
    }

    @Test
    public void GraphTest8() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph8 = FileLoader.loadGraphFromJson("src/test/resources/8.json");
        assertThat(isIndependentSetofEdges.run(graph8)).isFalse();
    }

    @Test
    public void GraphTest9() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph9 = FileLoader.loadGraphFromJson("src/test/resources/9.json");
        assertThat(isIndependentSetofEdges.run(graph9)).isFalse();
    }

    @Test
    public void GraphTest10() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph10 = FileLoader.loadGraphFromJson("src/test/resources/10.json");
        assertThat(isIndependentSetofEdges.run(graph10)).isTrue();
    }

    @Test
    public void GraphTest11() throws FileNotFoundException {
        IsIndependentSetOfEdgesDisconnecting isIndependentSetofEdges = new IsIndependentSetOfEdgesDisconnecting();
        var graph11 = FileLoader.loadGraphFromJson("src/test/resources/11.json");
        assertThat(isIndependentSetofEdges.run(graph11)).isTrue();
    }

}