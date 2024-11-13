# Summary
<p>A Java-based chat server allowing users to connect via custom client programs to join chatrooms and interact with friends.
  
  The server supports multiple features, including private messaging, username changes, text color customization, and the ability to view all users’ online/offline status and IP addresses. It identifies returning users based on prior network login, providing a personalized experience.
  
  A multithreading approach ensures efficient handling of simultaneous connections, maintaining performance across users. Limited to terminal interaction, the server still enables rich functionality, including listing commands via a help menu. This flexibility allows users to create custom clients that connect seamlessly to the server for interaction.</p>

# Functionalities
<p><ul>
  <li>Simple chat room with no user limit.</li>
  <li>Whispers for private messaging between users that not even the server can access.</li>
  <li>User list shows all user, both online and offline.</li>
  <li>Users can change their name.</li>
  <li>Users can customize their text color.</li>
  <li>Lightweight setup focused on easy and open interactions.</li>
</ul></p>

# How to run
<p>Run the ChatServer.jar file inside out/artifacts/ and your server should be running on port 10000.<br>If you want to use the server immediately simply connect to it using Netcat.<br>Any custom client you wish to develop should follow Netcat's core behaviours.</p>
