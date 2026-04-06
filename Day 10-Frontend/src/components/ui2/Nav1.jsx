import React from "react";

const Nav1 = () => {
  return (
    <header className="w-full py-4 px-6 md:px-10 flex items-center justify-between text-white relative z-20">
      <div className="text-2xl font-bold tracking-tight uppercase text-slate-100">
        Applancer.
      </div>
      <nav className="hidden md:flex items-center gap-8 text-sm font-medium text-slate-200">
        <a href="#" className="hover:text-white">
          How it works
        </a>
        <a href="#" className="hover:text-white">
          Features
        </a>
        <a href="#" className="hover:text-white">
          About Us
        </a>
        <a href="#" className="hover:text-white">
          Blog
        </a>
      </nav>
      <div className="flex items-center gap-3">
        <button className="text-slate-200 hover:text-white">Login</button>
        <button className="bg-lime-400 hover:bg-lime-300 text-slate-900 font-semibold px-4 py-2 rounded-full shadow-md shadow-lime-500/25 transition">
          Sign Up
        </button>
      </div>
    </header>
  );
};

export default Nav1;
