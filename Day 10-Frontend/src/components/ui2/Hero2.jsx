import React from "react";

const Hero2 = () => {
  return (
    <section className="px-6 md:px-10 py-12 lg:py-20 relative z-20">
      <div className="max-w-6xl mx-auto grid gap-10 lg:grid-cols-2 items-center">
        <div className="space-y-6 md:space-y-8">
          <p className="inline-flex items-center text-sm font-semibold text-lime-300 uppercase tracking-widest gap-2">
            <span className="h-1.5 w-1.5 rounded-full bg-lime-300"></span>
            Remote freelancer platform
          </p>

          <h1 className="text-4xl md:text-6xl lg:text-7xl font-extrabold leading-tight text-white">
            Work Without
            <br />
            Borders
          </h1>

          <p className="max-w-xl text-slate-200 text-base md:text-lg">
            Connect, collaborate, and conquer from anywhere with digital
            working. Empowering independent professionals to thrive in the
            modern economy.
          </p>

          <div className="flex flex-wrap gap-4">
            <button className="bg-lime-400 text-slate-900 font-semibold px-6 py-3 rounded-full shadow-lg shadow-lime-500/30 transition hover:bg-lime-300">
              Explore More
            </button>
            <button className="border border-slate-300/30 text-slate-100 hover:text-white px-6 py-3 rounded-full backdrop-blur-sm">
              Learn More
            </button>
          </div>

          <div className="mt-8 flex items-center gap-4 text-slate-100">
            <div className="flex -space-x-3">
              <div className="h-11 w-11 rounded-full bg-linear-to-br from-cyan-400 to-blue-500 ring-2 ring-slate-900"></div>
              <div className="h-11 w-11 rounded-full bg-linear-to-br from-indigo-400 to-purple-500 ring-2 ring-slate-900"></div>
              <div className="h-11 w-11 rounded-full bg-linear-to-br from-emerald-300 to-lime-400 ring-2 ring-slate-900"></div>
            </div>
            <div>
              <span className="text-3xl font-bold">2M+</span>
              <p className="text-sm text-slate-300">World Active Users</p>
            </div>
          </div>
        </div>

        <div className="relative">
          <div className="rounded-3xl border border-white/15 bg-slate-900/70 p-6 shadow-2xl shadow-black/70 backdrop-blur-xl">
            <div className="flex justify-between items-center mb-4">
              <div>
                <p className="text-slate-300 text-xs uppercase tracking-wider">
                  James Vishanti
                </p>
                <p className="text-white text-lg font-semibold">
                  UI/UX Designer
                </p>
              </div>
              <div className="h-10 w-10 rounded-full bg-linear-to-br from-indigo-400 to-cyan-400" />
            </div>

            <div className="grid grid-cols-2 gap-3">
              <div className="rounded-xl bg-slate-800/60 p-3">
                <p className="text-slate-300 text-xs">Earnings</p>
                <p className="text-white text-lg font-bold">$5,435.54</p>
                <p className="text-emerald-300 text-xs">
                  + 8.5% than last month
                </p>
              </div>
              <div className="rounded-xl bg-slate-800/60 p-3">
                <p className="text-slate-300 text-xs">Top Rated</p>
                <p className="text-white text-lg font-bold">82%</p>
                <p className="text-slate-300 text-xs">On-time Delivery</p>
              </div>
            </div>

            <div className="mt-5 text-slate-200">
              <div className="flex justify-between text-xs text-slate-400 mb-2">
                <span>Impressions</span>
                <span>4.9 / 5.0</span>
              </div>
              <div className="h-2 bg-slate-700 rounded-full overflow-hidden">
                <div className="h-full w-5/6 bg-lime-400"></div>
              </div>
            </div>
          </div>

          <div className="absolute top-6 right-6 h-20 w-20 rounded-full border border-lime-300/50 bg-lime-300/10 backdrop-blur-xl" />
          <div className="absolute bottom-5 left-8 h-10 w-10 rounded-full border border-cyan-400/40 bg-cyan-400/10" />
        </div>
      </div>
    </section>
  );
};

export default Hero2;
