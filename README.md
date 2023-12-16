# worker-kjs (template)

template of Kotlin/JS for Cloudflare Worker

---

## notice

- you should setup `wrangler.toml` about `.name` and `.compatibility_date`.

## usage

```sh
git clone https://github.com/Nanai10a/worker-kjs my-worker
cd my-worker

./build.sh --name my-worker --compatibility-date $(date +%Y-%m-%d)

# for example...
curl my-worker.${account_name}.workers.dev # respond "hi, kotlin/js?"
```
