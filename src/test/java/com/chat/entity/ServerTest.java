package com.chat.entity;

import java.net.Socket;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ServerTest {
    /**
     * Method under test:
     */
    @Test
    void testConnectionHandlerConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ConnectionHandler.client
        //     ConnectionHandler.in
        //     ConnectionHandler.nickname
        //     ConnectionHandler.out
        //     ConnectionHandler.this$0

        Server server = new Server();
        server.new ConnectionHandler(new Socket());

    }

    /**
     * Method under test: {@link Server.ConnectionHandler#sendMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConnectionHandlerSendMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.io.PrintWriter.println(String)" because "this.out" is null
        //       at com.chat.entity.Server$ConnectionHandler.sendMessage(Server.java:111)
        //   See https://diff.blue/R013 to resolve this issue.

        Server server = new Server();
        (server.new ConnectionHandler(new Socket())).sendMessage("Not all who wander are lost");
    }

    /**
     * Method under test: default or parameterless constructor of {@link Server}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Server.connections
        //     Server.done
        //     Server.pool
        //     Server.server

        new Server();
    }

    /**
     * Method under test: {@link Server.ConnectionHandler#run()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConnectionHandlerRun() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.io.BufferedReader.close()" because "this.in" is null
        //       at com.chat.entity.Server$ConnectionHandler.shutdown(Server.java:118)
        //       at com.chat.entity.Server$ConnectionHandler.run(Server.java:106)
        //   See https://diff.blue/R013 to resolve this issue.

        Server server = new Server();
        (server.new ConnectionHandler(new Socket())).run();
    }

    /**
     * Method under test: {@link Server.ConnectionHandler#run()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConnectionHandlerRun2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.net.Socket.getOutputStream()" because "this.client" is null
        //       at com.chat.entity.Server$ConnectionHandler.run(Server.java:77)
        //   See https://diff.blue/R013 to resolve this issue.

        ((new Server()).new ConnectionHandler(null)).run();
    }

    /**
     * Method under test: {@link Server#run()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRun() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.net.ServerSocket.isClosed()" because "this.server" is null
        //       at com.chat.entity.Server.shutdown(Server.java:53)
        //       at com.chat.entity.Server.run(Server.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Server()).run();
    }

    /**
     * Method under test: {@link Server#broadcast(String)}
     */
    @Test
    void testBroadcast() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Server.connections
        //     Server.done
        //     Server.pool
        //     Server.server

        (new Server()).broadcast("Not all who wander are lost");
    }

    /**
     * Method under test: {@link Server.ConnectionHandler#shutdown()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConnectionHandlerShutdown() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.io.BufferedReader.close()" because "this.in" is null
        //       at com.chat.entity.Server$ConnectionHandler.shutdown(Server.java:118)
        //   See https://diff.blue/R013 to resolve this issue.

        Server server = new Server();
        (server.new ConnectionHandler(new Socket())).shutdown();
    }

    /**
     * Method under test: {@link Server#shutdown()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testShutdown() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.net.ServerSocket.isClosed()" because "this.server" is null
        //       at com.chat.entity.Server.shutdown(Server.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Server()).shutdown();
    }
}

