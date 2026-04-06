
import Hero2 from "./components/ui2/Hero2";
import Nav1 from "./components/ui2/Nav1";

function App() {
  return (
    <div
      className="min-h-screen bg-cover bg-center relative"
      style={{
        backgroundImage: "url('/image/Background.png')",
      }}
    >
      <div className="absolute inset-0 bg-black/70"></div>

      <div className="relative z-20">
        <Nav1 />
        <Hero2 />
      </div>
    </div>
  );
}

export default App;
