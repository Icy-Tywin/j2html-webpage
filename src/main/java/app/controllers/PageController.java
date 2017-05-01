package app.controllers;

import app.views.pages.DownloadView;
import app.views.pages.ExamplesView;
import app.views.pages.IndexView;
import app.views.pages.NewsView;
import app.views.pages.PageNotFoundView;
import spark.Request;
import spark.Response;

public class PageController {

    public static String serveIndex(Request req, Response res) {
        return IndexView.render();
    }

    public static String serveDownload(Request req, Response res) {
        return DownloadView.render();
    }

    public static String serveExamples(Request req, Response res) {
        return ExamplesView.render();
    }

    public static String serveNews(Request req, Response res) {
        return NewsView.render();
    }

    public static String serve404(Request req, Response res) {
        return PageNotFoundView.render();
    }
}
