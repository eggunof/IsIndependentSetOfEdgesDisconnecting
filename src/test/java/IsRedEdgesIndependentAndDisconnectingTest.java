import org.junit.jupiter.api.Test;
import ru.leti.wise.task.graph.util.FileLoader;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class IsRedEdgesIndependentAndDisconnectingTest {
    @Test
    public void GraphTest1() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph1 = FileLoader.loadGraphFromJson("src/test/resources/graph1.json");
        assertThat(isIndependentSetOfEdges.run(graph1)).isFalse();
    }

    @Test
    public void GraphTest2() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph2 = FileLoader.loadGraphFromJson("src/test/resources/graph2.json");
        assertThat(isIndependentSetOfEdges.run(graph2)).isTrue();
    }

    @Test
    public void GraphTest3() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph3 = FileLoader.loadGraphFromJson("src/test/resources/graph3.json");
        assertThat(isIndependentSetOfEdges.run(graph3)).isFalse();
    }

    @Test
    public void GraphTest4() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph4 = FileLoader.loadGraphFromJson("src/test/resources/graph4.json");
        assertThat(isIndependentSetOfEdges.run(graph4)).isFalse();
    }

    @Test
    public void GraphTest5() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph5 = FileLoader.loadGraphFromJson("src/test/resources/graph5.json");
        assertThat(isIndependentSetOfEdges.run(graph5)).isTrue();
    }

    @Test
    public void GraphTest6() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph6 = FileLoader.loadGraphFromJson("src/test/resources/graph6.json");
        assertThat(isIndependentSetOfEdges.run(graph6)).isTrue();
    }

    @Test
    public void GraphTest7() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph7 = FileLoader.loadGraphFromJson("src/test/resources/graph7.json");
        assertThat(isIndependentSetOfEdges.run(graph7)).isFalse();
    }

    @Test
    public void GraphTest8() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph8 = FileLoader.loadGraphFromJson("src/test/resources/graph8.json");
        assertThat(isIndependentSetOfEdges.run(graph8)).isTrue();
    }

    @Test
    public void GraphTest9() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph9 = FileLoader.loadGraphFromJson("src/test/resources/graph9.json");
        assertThat(isIndependentSetOfEdges.run(graph9)).isFalse();
    }

    @Test
    public void GraphTest10() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph10 = FileLoader.loadGraphFromJson("src/test/resources/graph10.json");
        assertThat(isIndependentSetOfEdges.run(graph10)).isFalse();
    }

    @Test
    public void GraphTest11() throws RuntimeException {
        IsRedEdgesIndependentAndDisconnecting isIndependentSetOfEdges = new IsRedEdgesIndependentAndDisconnecting();
        var graph11 = FileLoader.loadGraphFromJson("src/test/resources/graph11.json");
        assertThat(isIndependentSetOfEdges.run(graph11)).isFalse();
    }

}