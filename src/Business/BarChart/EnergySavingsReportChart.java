/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BarChart;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Harsh
 */
public class EnergySavingsReportChart {

    private Report report;
    private JFreeChart barChart;

    public EnergySavingsReportChart(String applicationTitle, String chartTitle, Report report) {
        this.report = report;
        this.barChart = ChartFactory.createBarChart(
                chartTitle,
                "Apartment Customisation Paramters:",
                "% Energy Savings:",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        
        //Customize the Bar Chart
        //https://www.tutorialspoint.com/jfreechart/jfreechart_bar_chart.htm
        //https://tatiyants.com/how-to-customize-jfree-charts/
        File BarChart = new File( "C:\\Users\\Harsh\\Documents\\NetBeansProjects\\UnitedConstructionProject\\src\\userinterface\\EnergyRegulatoryCommission\\EnergySavingsBarChart.jpeg" ); 
        try {
            ChartUtilities.saveChartAsJPEG( BarChart , barChart , 600 , 350 );
        } catch (IOException ex) {
            Logger.getLogger(EnergySavingsReportChart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ChartPanel getChartPanel() {
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        return chartPanel;
    }

    private CategoryDataset createDataset() {
        final String window = "WINDOW";
        final String power = "APARTMENT POWER TYPE";
        final String spaceHeating = "SPACE HEATING";
        final String light = "LIGHT FIXTURES";
        final String energy = "Energy Saved";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //adding values to the dataset 
        dataset.addValue(report.getEnergyWindow(), energy, window);
        dataset.addValue(report.getEnergyPower(), energy, power);
        dataset.addValue(report.getEnergySpaceHeating(), energy, spaceHeating);
        dataset.addValue(report.getEnergyLight(), energy, light);

        return dataset;
    }

}
