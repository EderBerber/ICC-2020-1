package practica14;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;
import org.knowm.xchart.SwingWrapper;

public class Graficacion {

    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder()
                            .title("Regresión lineal")
                            .width(800)
                            .height(600)
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .theme(ChartTheme.Matlab)
                            .build();
     
        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);

        List<String[]> elementos = null;

        try {
            elementos = LectorCSV.leer("../317075292.csv");
        } catch (IOException esaú) {
            throw new Exception ("Archivo no encontrado" + esaú);
        }
        double[] xData = new double[elementos.size()-1];
        double[] yData = new double[elementos.size()-1];
        for (String[] k : elementos) {
            k[0] += xData;
            k[1] += yData;
        }
        double[] xData = xData;
            
        }
        double[] yData = yData;
            
        

        double m = 4; //aleatorio
        double b = 9; //aleatorio

        XYSeries sampleSeries = chart.addSeries("Observaciones", xData, yData);
        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        sampleSeries.setMarkerColor(XChartSeriesColors.RED);

        XYSeries lineSeries = chart.addSeries(
            "Línea", new double[]{x1,xn}, new double[]{y1,yn});
        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
        lineSeries.setLineColor(XChartSeriesColors.BLUE);
        lineSeries.setLineWidth(3);

        new SwingWrapper<XYChart>(chart).displayChart();
    }

}